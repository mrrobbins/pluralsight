package com.github.mrrobbins.pluralsight.kotlin.kotlin


class Meeting(val title: String) {

    var location = "TBD"

    @JvmField // use public visibility in java, wouldn't normally do this
    var description = "";

    @Throws(MeetingException::class) // Marks checked exception in java
    fun addAttendee(attendee: String) {
        if (attendee.isNullOrEmpty()) {
            throw MeetingException("Attendee must have name")
        }
    }

    companion object {

        val SOME_CONST1 = 2

        @JvmField
        val SOME_CONST2 = 1

        @JvmStatic
        fun getSomeConst3() : Int {
            return 3;
        }
    }
}

class MeetingException(message: String) : Exception(message) {

}