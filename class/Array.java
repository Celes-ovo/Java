package com.dinfree.java.part1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// 자바에서 배열선언시 타입[] 변수명 혹은 타입 변수명[] 형식을 모두 사용할 수 있음.
		int[] scores = {12, 13, 14, 15, 0};
		String[] names = {"Flygon", "Garchomp", "Emolga"};
		
		//=======================================
		System.out.println(scores);
		System.out.println(Arrays.asList(scores));
		//=======================================
		
		scores[4] = 16;
		
		System.out.println(scores[4]);
		// print the id
		//System.out.println(scores);
		System.out.println(scores.length);
		System.out.println(names[2]);
		
		//=======================================
		
		String[] names_copied = Arrays.copyOf(names, names.length);
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
				
		Arrays.sort(names_copied);
		System.out.println(Arrays.toString(names_copied));
		
		//=======================================
		
		int[][][] allScores = {
					{
				        {90,85,70,55,60},
				        {96,88,81,91,75},
				        {96,88,81,91,75},
				        {96,88,81,91,75}
				    },
				    {
				        {91,82,73,54,65},
				        {96,87,88,99,80},
				        {91,82,83,94,75},
				        {96,87,88,99,70}
				    },
				    {
				        {92,83,74,55,66},
				        {97,88,89,90,71},
				        {92,83,84,95,76},
				        {97,88,89,90,71}
				    }
			};
		System.out.println(allScores[1][2][0]);
		
		}
	}
