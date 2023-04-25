package example.android.exam.examcp1.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SecondData(val title: String, val isCanBack: Boolean, val description: String) :
    Parcelable