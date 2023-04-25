package example.android.exam.examcp1.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import example.android.exam.examcp1.fragment.MainFragment
import example.android.exam.examcp1.R
import example.android.exam.examcp1.model.DialogData

class MainDialog : DialogFragment() {
    companion object {
        const val KEY_DATA_DIALOG = "KEY_DATA_DIALOG"
        fun newInstant(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result = view.findViewById<TextView>(R.id.tvResult)
        result.text = arguments?.getParcelable<DialogData>(KEY_DATA_DIALOG).toString()
        val btnClose = view.findViewById<Button>(R.id.btnClose)
        btnClose.setOnClickListener { this.dialog?.dismiss() }
    }
}