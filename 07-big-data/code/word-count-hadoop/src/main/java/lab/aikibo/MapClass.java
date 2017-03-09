package lab.aikibo;

import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import java.io.IOException;
import java.util.StringTokenizer;

public class MapClass extends Mapper<LongWritable, Text, Text, IntWritable> {

	private final static IntWritable one = new IntWritable(1);
	private Text word = new Text();

	protected void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
		String line = value.toString();
		StringTokenizer st = new StringTokenizer(line, " ");
		while(st.hasMoreTokens()) {
			String teks = st.nextToken();
			word.set(teks);
			context.write(word, one);
			System.out.println("data {" + teks + "} telah dihitung");
		}
	}

}
