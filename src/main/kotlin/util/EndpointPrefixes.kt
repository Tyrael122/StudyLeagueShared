package util

object EndpointPrefixes {
    const val LOGIN = "/login"
    const val STUDENT = "/student"
    const val STUDENT_ID = "$STUDENT/{studentId}"
    const val SUBJECT = "/subjects"
    const val SCHEDULED_SUBJECT = "/scheduled-subjects"
    const val SUBJECT_ID = "$SUBJECT/{subjectId}"
    const val SCHEDULE = "/schedule"
    const val GOALS = "/goals"
    const val STATS = "/stats"
    const val CURRENT_TIME = "/current-time"
    const val STUDY_CYCLE = "/study-cycle"
    const val STUDY_CYCLE_NEXT = "$STUDY_CYCLE/next"
    const val CHANGE_SCHEDULE_METHOD = "/change-schedule-method"
}
