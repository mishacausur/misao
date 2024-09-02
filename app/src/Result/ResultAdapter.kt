import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ResultAdapter(
    private val dataSet: List<ResultData>
) : RecyclerView.Adapter<ResultAdapter.ViewHolder> {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(15)
        val label: TextView = view.findViewById(150)
    }
}