import java.util.*;


public class Job {

	public double execTime; //�䱸 ����ð�
	public double releaseTime; //���� �� job�� release �Ǿ��°�?
	public double Deadline; //absolute deadline
	public int TaskIndex; // �� job�� ��� task�� �����ֳ�

	public Job(double exectime, double releaseTime, double deadline, int taskIndex){ //Job�� ������

		this.execTime = exectime;
		this.releaseTime = releaseTime;
		this.Deadline = deadline;
		this.TaskIndex = taskIndex;
	}
}