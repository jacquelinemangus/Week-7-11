package projects;

import projects.dao.DbConnection;

public class ProjectsApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection.getConnection();
	}
}

//2.	In the main() method, call the DbConnection.getConnection() method.
