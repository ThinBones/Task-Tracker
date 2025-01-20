public class Task {
	private String taskTime;
	private String taskName;
	private String taskDesc;

	public Task(String t, String n, String d) {
		taskTime = t;
		taskName = n;
		taskDesc = d;
	}

	public String getTime() {
		return taskTime;
	}

	public void setTime(String t) {
		taskTime = t;
	}

	public String getName() {
		return taskName;
	}

	public void setName(String n) {
		taskName = n;
	}

	public String getDesc() {
		return taskDesc;
	}

	public void setDesc(String d) {
		taskDesc = d;
	}
}
