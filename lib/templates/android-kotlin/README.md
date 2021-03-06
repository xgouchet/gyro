# Android Template Information

| Name      | Description       |
| --------- | ----------------- |
| Folder name | templates/android-kotlin |
| Invocation example | `gyro -m <model> -t android-kotlin …` |
| Language | Kotlin |

If you want to use this template you need to work with `Realm`.

# Characteristics

In this template you have additional parameters to inject constants : 

- package (ex : **com.gyro.model.realm**)

# Usage


Package exemple :

```bash
gyro -m <model> -t android-kotlin -o <output> --param package:com.gyro.model.realm
```


# Generated Code

`FidelityCard.kt`:

```kotlin
package com.gyro.model.realm

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject

class FidelityCard: RealmObject() {

    object Attributes {
        const val IDENTIFIER: String = "identifier";
        const val POINTS: String = "points";
    }

    object Relationships {
        const val USER: String = "user";
    }

    private var identifier: Short = 0;
    private var points: Integer = 0;
    private var user: User? = null;
}
```

