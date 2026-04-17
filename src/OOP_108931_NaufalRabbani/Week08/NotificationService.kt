package OOP_108931_NaufalRabbani.Week08

class NotificationService{
    fun sendEmail(emailAddress: String){
        println("Sending email to $emailAddress")
    }

    fun processUser(user: UserProfile){
        if(user.email != null){
            sendEmail(user.email)
        } else {
            println("No email address provided for ${user.name}")
        }
    }
}