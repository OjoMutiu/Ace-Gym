package com.example.acegym;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;

    private ArrayList<Training> training;
    private static ArrayList<Plan> plans;

    public Utils() {
        if(training == null){
            training = new ArrayList<>();
            initData();
        }
    }

    private void initData() {

        Training pushUp = new Training(1, "Push up", "An exercise in which a person lies facing the floor and, keeping their back straight, raises their body by pressing down on their hands.",
                "The definition of a push-up is an exercise done laying with face, palms and toes facing down, keeping legs and back straight, extending arms straight to push body up and back down again. An example of a push-up is a great exercise that works the chest, shoulder and arm muscles.",
                "https://www.istreetwatch.co.uk/wp-content/uploads/2019/01/push-ups.jpg");
        training.add(pushUp);

        Training squat = new Training(2, "Squat", "If you crouch down very low and sit on your heels, you squat",
                "A squat is a strength exercise in which the trainee lowers their hips from a standing position and then stands back up. During the descent of a squat, the hip and knee joints flex while the ankle joint dorsiflexes; conversely the hip and knee joints extend and the ankle joint plantarflexes when standing up.",
                "https://lmimirror3pvr.azureedge.net/static/media/16949/921e38e6-9020-4dd9-a619-7726cadc7284/fit-planet-60-hero-image-960x540.jpg");
        training.add(squat);

        Training legPress = new Training(3, "Leg Press", "The leg press is a weight training exercise in which the individual pushes a weight or resistance away from them using their legs.",
                "The leg press is a weight training exercise in which the individual pushes a weight or resistance away from them using their legs. The term leg press also refers to the apparatus used to perform this exercise. The leg press can be used to evaluate an athlete's overall lower body strength (from knee joint to hip).",
                "https://fitnessvolt.com/wp-content/uploads/2022/05/Leg-Press-Foot-Placements.jpg");
        training.add(legPress);

        Training pectorals = new Training(4, "Pectorals", "Amazing for building chest muscles",
                "Your pectoral muscles are one of the largest muscle groups in your upper body. They pull on the humerus (upper arm bone), allowing you to make vertical, horizontal, and rotational movements with your arms. You use these muscles all day, every day, so it's important to keep them strong.",
                "https://www.bodybuilding.com/images/2016/july/build-your-best-chest-5-must-do-pec-exercises-header-v2-960x540.jpg");
        training.add(pectorals);

        Training pullUps = new Training(5, "Pull-ups", "An exercise involving raising oneself with one's arms by pulling up against a horizontal bar fixed above one's head.",
                "A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands and pulls up. As this happens, the elbows flex and the shoulders adduct and extend to bring the elbows to the torso.",
                "https://www.fititnow.com/wp-content/uploads/2020/02/3-Simple-Tips-To-Improve-Your-Pull-Ups.jpg");
        training.add(pullUps);
    }

    public synchronized static Utils getInstance(){
        if(null == instance ){
            instance = new Utils();
        }
        return instance;
    }

    public ArrayList<Training> getTraining() {
        return training;
    }

    public static boolean addPlan(Plan plan){
        if(null == plans){
            plans = new ArrayList<Plan>();
        }
        return plans.add(plan);
    }
}
