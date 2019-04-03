import java.util.*;


public class Job {

	public double execTime; //요구 실행시간
	public double releaseTime; //언제 이 job이 release 되었는가?
	public double Deadline; //absolute deadline
	public int TaskIndex; // 이 job이 어느 task에 속해있나

	public Job(double exectime, double releaseTime, double deadline, int taskIndex){ //Job의 생성자

		this.execTime = exectime;
		this.releaseTime = releaseTime;
		this.Deadline = deadline;
		this.TaskIndex = taskIndex;
	}
}