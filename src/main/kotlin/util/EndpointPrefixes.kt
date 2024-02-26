package util

object EndpointPrefixes {
    const val STUDENT = "/student"
    const val STUDENT_ID = "$STUDENT/{studentId}"
    const val SUBJECT = "/subjects"
    const val SCHEDULED_SUBJECT = "/scheduled-subjects"
    const val SUBJECT_ID = "$SUBJECT/{subjectId}"
    const val SCHEDULE = "/schedule"
    const val GOALS = "/goals"
    const val STATS = "/stats"
    const val CURRENT_TIME = "/current-time"
}
