package enums

enum class StudySchedulingMethods {
    SCHEDULE,
    STUDYCYCLE;

    companion object {
        fun getDefaultValue(): StudySchedulingMethods {
            return STUDYCYCLE
        }
    }
}