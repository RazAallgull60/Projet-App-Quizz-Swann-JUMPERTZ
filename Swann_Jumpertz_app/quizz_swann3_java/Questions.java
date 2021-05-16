package com.example.quizz_swann3;

public class Questions {

    public String mQuestions[] = {

            "Quelle est la capitale de l'Islande ?",
            "Quelle est la capitale de l'Ecosse ?",
            "Quelle est la capitale de la Roumanie ?",
            "Quelle est la capitale de la Russie ?",
            "Quelle est la capitale du Brésil ?",
            "Quelle est la capitale du Pérou ?",

    };

    private String mChois[] [] = {

            {"Dublin", "Belfast", "Reykjavik", "Porto"},
            {"Paris", "Edimbourg","Glasgow", "Aue"},
            {"Bucarest", "Budapest", "Minsk", "Riga"},
            {"Kazan", "Grozny", "Moscou", "Vladivostok"},
            {"Manaus", "Bello Horizonte", "Brasilia", "Sao Paulo"},
            {"Quito", "Montevideo","Cancun","Lima"}
    };

    private final String mReponseCorrectes [] = {"Reykjavik", "Edimbourg", "Bucarest", "Moscou", "Brasilia", "Lima"};

    public String getQuestion(int a) {
        String question =mQuestions [a];
        return question;
    }

    public String getChoix1(int a) {
        String choix = mChois[a] [0];
        return choix;
    }

    public String getChoix2(int a) {
        String choix = mChois[a] [1];
        return choix;
    }

    public String getChoix3(int a) {
        String choix = mChois[a] [2];
        return choix;
    }

    public String getChoix4(int a) {
        String choix = mChois[a] [3];
        return choix;
    }

    public String getReponseCorrecte(int a) {
        String reponse = mReponseCorrectes[a];
        return reponse;
    }

}
