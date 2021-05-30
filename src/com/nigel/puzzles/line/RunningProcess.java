package com.nigel.puzzles.line;

import java.util.ArrayList;
import java.util.List;

public class RunningProcess {

	public String solution(int t, String[] logs) {
		// write your code in Java 8
		List<String> runningProcesses = new ArrayList<String>();
		for (String str : logs) {
			String[] parts = str.split(" ");
			int time = Integer.parseInt(parts[0]);
			if (time >= t) {
				if (runningProcesses.size() == 1) {
					return runningProcesses.get(0);
				}
				return "-1";
			}
			String processName = parts[1];
			String processState = parts[2];
			if (!processState.equals("running")) {
				if(runningProcesses.contains(processName)) {
					runningProcesses.remove(processName);
				}
			} else if (processState.equals("running")) {
				runningProcesses.add(processName);
			}
		}

		return "-1";
	}
	
	
	public static void main(String[] args) {
		RunningProcess rp = new  RunningProcess();
		String[] logs = {"0 A created","1 B Created","10 A running", "12 B waiting", "13 B running", "14 A waiting",
				"17 B terminated", "18 A terminated"};
		System.out.println(rp.solution(15, logs));
		
	}
	
	
	
	
	

}
