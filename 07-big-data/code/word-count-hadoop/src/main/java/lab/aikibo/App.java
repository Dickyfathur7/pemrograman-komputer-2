package lab.aikibo;

import org.apache.hadoop.util.ToolRunner;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
		int exitCode = ToolRunner.run(new WordCount(), args);
		System.exit(exitCode);
    }
}
