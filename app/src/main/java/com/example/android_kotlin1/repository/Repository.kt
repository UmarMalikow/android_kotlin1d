package com.example.android_kotlin1.repository

import com.example.android_kotlin1.model.Model

class Repository {

    private val listOfCharacters = mutableListOf<Model>()

    fun getListOfCharacters() : List<Model>{
        listOfCharacters.clear()
        listOfCharacters.add(
            Model(
//            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTYGML3V2Ml6rEFCdoBz0rZ8WXG0hSzAR59lRlIhC-b7N-HIscJYX3jliEfH_a_IwHVjb0RL_yo&s=19",
            "Джастин"
        )
        )
        listOfCharacters.add(
            Model(
//                "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcQd8Hi-Qwm9GRodm_n6IhCFirG3cLiJ2xdbASq2tUfh01ZtXo5k8fqySWXHgUSbRRf0E00bBRE&s=19",
                "Дэн Хармон"
            )
        )
        listOfCharacters.add(
            Model(
//                "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcRn0JlWaneZ051s3Lsey2Abt0u64arT5CQgKa85FuIBbluDyKBZvIYpMtp6ucQvw0Qp4QXoG4g&s=19",
                "Спенсер Грэммер"
            )
        )
        listOfCharacters.add(
            Model(
//                "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcQRr_A05S911ER9cHRaEjeEk97XMkxLyPswUu9-PcWIqky_tOYY5ZXTpUvMuoI0JkBLCh7ZfUaB&s=19",
                "Крис Парнелл"
            )
        )
        listOfCharacters.add(
            Model(
//                "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTD0dzoLpGxzBjvW0nrpk_gvkNZIO4FmR2zUqQwO0cmg0qZm66ZeGq1HHavnoUQUtVTkmuTzms&s=19",
                "Сара Чок"
            )
        )
        listOfCharacters.add(
            Model(
//                "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTfM4KJSzP3OvobYq6RXKTeMz2guSj5YIS2Cxa6k4fplLormqTZ3DUKNQTcQ8X3NLs4U3p9kgw&s=19",
                "Кари Уолгрен"
            )
        )
        listOfCharacters.add(
            Model(
//                "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTG3V6OqamSipldcDRpggw5efmZs0op0EP9VQWzYuz1SJqsum4Rx0kgrhqEBQR-WofFH-XbQSSu&s=19",
                "Морис Ламарш"
            )
        )
        listOfCharacters.add(
            Model(
//                "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcR8mKcy2WPG2qnQe0r0NgarWf_pYgC3HKiuK-1Izd1PnQXLno9pyn-yQjRBcVlQe_1JgekL68cy&s=19",
                "Томас Кенни"
            )
        )
        return listOfCharacters
    }

}