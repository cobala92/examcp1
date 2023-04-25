package example.android.exam.examcp1.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DialogData(val title: String, val action: String, val isCloseable: Boolean) : Parcelable
