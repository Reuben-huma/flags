package eu.tutorials.flags.data

import eu.tutorials.flags.R
import eu.tutorials.flags.model.Flag

class DataSource {

    fun getQuestions(): List<Flag> {
        return listOf(
            Flag(
                image = R.drawable.ic_flag_of_argentina,
                options = listOf("Argentina", "Australia", "Armenia", "Austria"),
                answer = "Argentina"
            ),
            Flag(
                image = R.drawable.ic_flag_of_australia,
                options = listOf("Angola", "Austria", "Australia", "Armenia"),
                answer = "Australia"
            ),
            Flag(
                image = R.drawable.ic_flag_of_brazil,
                options = listOf("Belarus", "Belize", "Brunei", "Brazil"),
                answer = "Brazil"
            ),
            Flag(
                image = R.drawable.ic_flag_of_belgium,
                options = listOf("Bahamas", "Belgium", "Barbados", "Belize"),
                answer = "Belgium"
            ),
            Flag(
                image = R.drawable.ic_flag_of_fiji,
                options = listOf("Gabon", "France", "Fiji", "Finland"),
                answer = "Fiji"
            ),
            Flag(
                image = R.drawable.ic_flag_of_germany,
                options = listOf("Germany", "Georgia", "Greece", "none of these"),
                answer = "Germany"
            ),
            Flag(
                image = R.drawable.ic_flag_of_denmark,
                options = listOf("Dominica", "Egypt", "Denmark", "Ethiopia"),
                answer = "Denmark"
            ),
            Flag(
                image = R.drawable.ic_flag_of_india,
                options = listOf("Ireland", "Iran", "Hungary", "India"),
                answer = "India"
            ),
            Flag(
                image = R.drawable.ic_flag_of_new_zealand,
                options = listOf("Australia", "New Zealand", "Tuvalu", "United States of America"),
                answer = "New Zealand"
            ),
            Flag(
                image = R.drawable.ic_flag_of_kuwait,
                options = listOf("Kuwait", "Jordan", "Sudan", "Palestine"),
                answer = "Kuwait"
            )
        )
    }
}