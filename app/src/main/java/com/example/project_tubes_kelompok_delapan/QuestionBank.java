package com.example.project_tubes_kelompok_delapan;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Sedikit minat atau kesenangan dalam melakukan sesuatu",
            "2. Merasa tidak berguna",
            "3. Susah tidur atau tidur terlalu banyak",
            "4. Merasa Capek dan tidak mempunyai energi",
            "5. Pola makan yang buruk atau makan berlebihan"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Tidak sama sekali","Beberapa hari","Lebih dari setengah hari","Hampir setiap hari"},
            {"Tidak sama sekali","Beberapa hari","Lebih dari setengah hari","Hampir setiap hari"},
            {"Tidak sama sekali","Beberapa hari","Lebih dari setengah hari","Hampir setiap hari"},
            {"Tidak sama sekali","Beberapa hari","Lebih dari setengah hari","Hampir setiap hari"},
            {"Tidak sama sekali","Beberapa hari","Lebih dari setengah hari","Hampir setiap hari"}
    };

    private String mCorrectAnswers[] = {"Tidak sama sekali","Beberapa hari","Lebih dari setengah hari","Hampir setiap hari","Tidak sama sekali"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}