public class Task {
	private String time;
	private String name;
	private String desc;

	public Task(String t, String n, String d) {
		time = t;
		name = n;
		desc = d;
	}

	public String toString() {
		String temp;
		temp = ("Time: " + time + "; Name: " + name + "; Description: " + desc);
		return temp;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String t) {
		time = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String d) {
		desc = d;
	}
}
