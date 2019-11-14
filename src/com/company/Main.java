package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] quiz = {"Is it a violation of the DPA if personal data is kept after it has been used for the purpose?",
                "Does the copyright design and patents act prevent people from stealing copyrighted material?",
                ""};
        boolean[] answers = {true,false,true};
        for(int x = 0l x < quiz.length; x++){
            System.out.println(quiz[x]);
            if(ans==answers[x]) correct++;
        }
        int score = 0;

    }
}
