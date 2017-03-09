package lab.aikibo;

import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.Text;
import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import java.util.Iterator;

public class ReduceClass extends Reducer<Text, IntWritable, Text, IntWritable> {

	protected void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {
		int sum = 0;
		Iterator<IntWritable> valuesIt = values.iterator();

		while(valuesIt.hasNext()) {
			sum = sum + valuesIt.next().get();
		}

		System.out.println("data {" + key + "," + sum + "} sudah di reduce");

		context.write(key, new IntWritable(sum));
	}

}
