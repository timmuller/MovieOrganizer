package Infrastructure;

import java.io.File;
import java.util.ArrayList;

public class DirectoryList {

	private ArrayList<String> paths;
	
	public DirectoryList() {
		paths = new ArrayList<String>();
	}
	
	public boolean addPath(String path){
		if(pathExists(path) && !paths.contains(path)){
			return paths.add(path);
		}
		return false;
	}
	
	private boolean pathExists(String path){
		if(path == null){
			return false;
		}
		File checkDirectory = new File(path);
		return checkDirectory.exists();
	}
	
	
}
