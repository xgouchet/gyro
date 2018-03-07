/* DO NOT EDIT | Generated by gyro */

import RealmSwift
import Foundation

final class User: Object {

  enum Attributes: String {
    case name = "name" /* Primary Key */
    case birthday = "birthday"
  }

  enum Relationships: String {
    case fidelityCard = "fidelityCard"
  }

  @objc dynamic var name: String = "" /* Primary Key */
  @objc dynamic var birthday: Date = Date()
  @objc dynamic var fidelityCard: FidelityCard?

  override static func primaryKey() -> String? {
    return "name"
  }

}
