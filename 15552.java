import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main
{
	public static void main(String[] args) throws IOException
	{
		int i;
		int A, B;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		for(i = 0; i < T; i++)
		{
			String text = br.readLine();
			String[] word = text.split(" ");
			A = Integer.parseInt(word[0]);
			B = Integer.parseInt(word[1]);
			bw.write((A + B) + "\n");
		}

		bw.flush();
		bw.close();
	}
}