import org.apache.hadoop.mapred.MapReduceBase;

// ambil bahan di www.tutorialspoint.com/hadoop/hadoop_mapreduce.htm
public class ProcessUnits {
	
	/**
	 * Kelas Mapper
	 * urutan parameter di Mapper :
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
			String lastToken = null;
			StringTokenizer s = new StringTokenizer(line, "\t");
			String year = s.nextToken();

			while(s.hasMoreTokens()) {
				lastToken = s.nextToken();
			}

			int avgPrice = Integer.parseInt(lastToken);
			output.collect(new Text(year), new IntWritable(avgPrice));
		}
	}

	/**
	 * Kelas Reducer
	 * urutan parameter di Reducer
	 *  Text: key
	 *  IntWritable: value
	 *  Text: key
	 *  IntWritable: value
	 */
	public static class E_EReduce extends MapReduceBase 
			implements Reducer<Text, IntWritable, Text, IntWritable> {
		public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) 
				throws IOException {
			int maxAvg = 30;
			int val = Integer.MIN_VALUE;

			while(values.hasNext()) {
				if((val = values.next().get()) > maxAvg) {
					output.collect(key, new IntWritable(val));
				}
			}
		}
	}

	public static void main(String args[]) throws Exception {
		JobConf conf = new JobConf(ProcessUnits.class);

		conf.setJobName("max_electricityunits");
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);
		conf.setMapperClass(E_EMapper.class);
		conf.setCombinerClass(E_EReduce.class);
		conf.setReducerClass(E_EReduce.class);
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);

		FileInputFormat.setInputPaths(conf, new Path(args[0]));
		FileOutputFormat.setOutputPath(conf, new Path(args[1]));

		JobClient.runJob(conf);
	}
}
