package beans;

public class AdjescencyMatrix {
	private boolean [][] adjmat;
	private int vertices;
	public AdjescencyMatrix( int vertices) {
		super();
		this.vertices = vertices;
		adjmat=new boolean[vertices][vertices];
	}
	public void addedge(int i,int j) {
		adjmat[i][j]=true;
		adjmat[j][i]=true;
	}
	public void removredge(int i,int j) {
		adjmat[i][j]=false;
		adjmat[j][i]=false;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				sb.append((adjmat[i][j]?1:0)+"\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
