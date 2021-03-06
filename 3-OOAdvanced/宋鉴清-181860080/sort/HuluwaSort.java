package sort;

import character.*;
import java.util.Random;

public class HuluwaSort implements Sort{
    private String[] name = {"大娃", "二娃","三娃", "四娃", "五娃", "六娃", "七娃"};
	public static int Huluwa_NUM;
	static{
		Huluwa_NUM = 7;
	}
	public void DisorganizeLine(Huluwa[] Hulu_Queues){
		Random r = new Random(System.currentTimeMillis());
		boolean[] tmp = new boolean[]{false, false, false, false, false, false, false};
		int count = 0;
		while(count < Huluwa_NUM){
			int id = r.nextInt(7);
			if(tmp[id])
				continue;
			tmp[id] = true;
			Hulu_Queues[count] = new Huluwa(name[id], id);
			count++;
		}
		System.out.println("随机打乱葫芦娃的队列：");
		for(int i = 0; i < Huluwa_NUM; i++){
			System.out.print(name[Hulu_Queues[i].get_index()]);
			System.out.print(" ");
		}
		System.out.println();
	}
	public void orchestration_sort(GrandPa grandpa, Huluwa[] Hulu_Queues){
		System.out.println("\n以orchestration让葫芦娃们进行排序，即爷爷指挥");
		grandpa.SortHuluwa(Hulu_Queues);
		grandpa.CmdReportNum(Hulu_Queues);
	}
	public void choreography_sort(GrandPa grandpa, Huluwa[] Hulu_Queues){
		System.out.println("\n以choreography让葫芦娃们进行排序，即葫芦娃们自己进行排队");
		for(int i = 0; i < Hulu_Queues.length - 1; i++){
            for(int j = 0; j < Hulu_Queues.length - 1 - i; j++){
				if(!Hulu_Queues[j].compare_less(Hulu_Queues[j + 1])){
					Hulu_Queues[j].Swapwithnext(Hulu_Queues, j, j + 1);
				}
            }
		}
		grandpa.CmdReportNum(Hulu_Queues);
	}
}
