package nexacro.sample.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageModule {
	
	public static PagingVO makePageForNexa(
			int totalCnt, 
			int listSize, 
			int pageSize, 
			int pageNo
			){

		//Integer[] nums = new Integer[pageSize];
		int goLeft = 0;
		int goRight = 0;
		int pageCnt=0;
		int startNum=0;
		int endNum=0;
		int nums[] = new int[pageSize];
		
		/*System.out.println("================valid check first==============");
		System.out.println("pageNo="+pageNo);
		System.out.println("totalCnt="+totalCnt);
		System.out.println("listSize="+listSize);
		System.out.println("pageSize="+pageSize);
		System.out.println("goLeft="+goLeft);
		System.out.println("goRight="+goRight);
		System.out.println("pageCnt="+pageCnt);
		System.out.println("startNum="+startNum);
		System.out.println("endNum="+endNum);
		System.out.println("===================================");
		*/
		/*all page numbers*/
		int totalPage = totalCnt / listSize +1;
		if(totalCnt%listSize==0){
			totalPage--;
		}

		
		int userGroup = pageNo/pageSize;
		if(pageNo%pageSize==0){
			userGroup--;
		}
		if(userGroup!=0){
			goLeft=(userGroup-1)*pageSize+pageSize;
		}
		System.out.println("pageNo==="+pageNo);
		System.out.println("pageSize==="+pageSize);
		System.out.println("userGroup==="+userGroup);
		
	
		int count = 0;
		//String str="";
		for(int i=userGroup*pageSize+1; i<=userGroup*pageSize+pageSize; i++){
			System.out.println("i="+i);
				nums[count]=i;
				//str+=nums[count]+",";
				if(i==0){
					break;
					//str+=nums[count];
				}
				/*System.out.println("====middle check====");
				System.out.println("str="+str);
				System.out.println("nums[count]="+nums[count]);
				System.out.println("====middle check====");*/
				count++;
			if(i==totalPage){
				break;
			}
		}
		System.out.println("count===="+count);
		

				startNum=nums[0];
				endNum=nums[count-1];
		//endNum = nums[count];
		//startNum = nums[0];
		
		if(userGroup!=(totalPage/pageSize)-(totalPage%pageSize==0?1:0)){
			goRight = (userGroup+1)*pageSize+1;
		}
		
		System.out.println("================valid check==============");
		System.out.println("pageNo="+pageNo);
		System.out.println("totalCnt="+totalCnt);
		System.out.println("listSize="+listSize);
		System.out.println("pageSize="+pageSize);
		System.out.println("goLeft="+goLeft);
		System.out.println("goRight="+goRight);
		System.out.println("pageCnt="+pageCnt);
		System.out.println("startNum="+startNum);
		System.out.println("endNum="+endNum);
		System.out.println("===================================");
		
		
		PagingVO pvo = new PagingVO();
		
		pvo.setGoLeft(goLeft);
		System.out.println("goLeft"+pvo.getGoLeft());
		
		pvo.setGoRight(goRight);
		//pvo.setStrNum(str);
		pvo.setStartNum(startNum);
		pvo.setEndNum(endNum);
		pvo.setPageNo(pageNo);
		
		return pvo;
	}
	/****************************************************/
	
		
}
