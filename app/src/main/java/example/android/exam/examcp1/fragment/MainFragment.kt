package example.android.exam.examcp1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import example.android.exam.examcp1.R
import example.android.exam.examcp1.activity.SecondActivity
import example.android.exam.examcp1.dialog.MainDialog
import example.android.exam.examcp1.model.DialogData
import example.android.exam.examcp1.model.SecondData

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNavigate()
    }

    private fun setupNavigate() {
        // define nav host fragment
        val navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.fragment_container_main) as NavHostFragment
        val navController = navHostFragment.navController
        // define action move to destination
        val tvMoveToSecondActivityWithAction =
            view?.findViewById<TextView>(R.id.tvMoveToSecondActivityWithAction)
        val tvMoveToSecondActivityWithBundle =
            view?.findViewById<TextView>(R.id.tvMoveToSecondActivityWithBundle)
        val tvShowDialogMain = view?.findViewById<TextView>(R.id.tvShowMainDialogFragment)
        val tvMoveToSecondFragment =
            view?.findViewById<TextView>(R.id.tvMoveToSecondFragmentWithAction)

        // handle listener move next screen
        tvMoveToSecondActivityWithAction?.setOnClickListener {
            val secondData =
                SecondData("Second Data Test", true, "Move from main screen with Action")
            val action = MainFragmentDirections.actionMoveToSecond(secondData)
            navController.navigate(action)
        }
        tvMoveToSecondActivityWithBundle?.setOnClickListener {
            val secondData =
                SecondData("Second Data Test 11", true, "Move from main screen with Bundle")
            val bundle = bundleOf(SecondActivity.KEY_SECOND_DATA to secondData)
            navController.navigate(R.id.action_move_to_second, bundle)
        }
        tvShowDialogMain?.setOnClickListener {
            val dialogData = DialogData("dialog", "action show ", false)
            val bundle = bundleOf(MainDialog.KEY_DATA_DIALOG to dialogData)
            navController.navigate(R.id.action_show_main_dialog, bundle)
        }
        tvMoveToSecondFragment?.setOnClickListener {
            navController.navigate(R.id.action_move_to_second_fragment)
        }
    }
}