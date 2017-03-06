// ambil bahan di www.tutorialspoint.com/hadoop/hadoop_mapreduce.htm
public class ProcessUnits {
	
	/**
	 * Kelas Mapper
	 * urutan Generic di Mapper :
	 *   LongWritable : tipe input key
	 *   Text : tipe input value
	 *   Text : tipe output key
	 *   IntWritable : tipe output value
	 */
	public static class E_EMapper extends MapReduceBase 
			implements Mapper<LongWritable, Text, Text, IntWritable> {

		public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output,
				Reporter reporter) throws IOException {
			String line = value.toString();

		}

	}

}
