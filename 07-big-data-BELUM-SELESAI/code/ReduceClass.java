import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.Text;
import java.io.IOException;
import org.apache.hadoop.io.IntWritable;

public class ReduceClass extends Reducer {

	protected void reduce(Text key, Iterable values, Context context)
			throws IOException, InterruptedException {
		int sum = 0;
		Iterator valuesIt = values.iterator();

		while(valuesIt.hasNext()) {
			sum = sum + valuesIt.next().get();
		}

		context.write(key, new IntWritable("sum));
	}

}
