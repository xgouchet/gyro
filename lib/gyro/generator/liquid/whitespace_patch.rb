# Copyright 2016 - Niji
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

require 'liquid'

if Gem::Version.new(Liquid::VERSION) < Gem::Version.new('4.0.0')
  module Gyro
    module Generator
      # This allows to support whitespace trimming (which is only supported in Liquid 4) when using Liquid 3.0
      # It works by patching Liquid::Template using ruby's `Module#prepend` feature
      # See http://stackoverflow.com/a/4471202/803787 for more info on Monkey-Patching in Ruby
      #
      module LiquidWhitespacePatch
        # Patch for Liquid::Template class
        #
        module Template
          def parse(source, options = {})
            super(source.gsub(/\s*{%-/, "\v{%").gsub(/-%}\s*/, "%}\v"), options)
          end

          def render(*params)
            super(*params).delete("\v")
          end
        end

        # Patch for Liquid's String extension
        #
        module String
          def to_liquid
            super.delete("\v")
          end
        end
      end
    end
  end

  module Liquid
    # Monkey-Patch Liquid::Template class
    #
    class Template
      prepend Gyro::Generator::LiquidWhitespacePatch::Template
    end
  end

  # Monkey-Patch String
  #
  class String
    prepend Gyro::Generator::LiquidWhitespacePatch::String
  end
end
