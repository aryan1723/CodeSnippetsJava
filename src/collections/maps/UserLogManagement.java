package collections.maps;

import java.util.HashMap;
import java.util.Map;

class UserData{
    String name,course,activity;
    public UserData(String name, String course, String activity) {
        this.name = name;
        this.course = course;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }
}

public class UserLogManagement {
    public static void main(String[] args){
        String[][] dummylogs = {
                {"Alice Johnson", "Introduction to Python", "enrolled"},
                {"Mark Thompson", "Data Science 101", "watching"},
                {"Sarah Chen", "UI/UX Design", "watching"},
                {"James Wilson", "Machine Learning", "enrolled"},
                {"Elena Rodriguez", "Digital Marketing", "watching"},
                {"Liam Smith", "Web Development", "enrolled"},
                {"Sophia Brown", "Cyber Security", "watching"},
                {"Mason Davis", "Cloud Computing", "enrolled"},
                {"Isabella Miller", "Business Analytics", "watching"},
                {"Ethan Garcia", "Introduction to Python", "enrolled"},
                {"Olivia Martinez", "Data Science 101", "watching"},
                {"Lucas Anderson", "UI/UX Design", "enrolled"},
                {"Mia Taylor", "Machine Learning", "watching"},
                {"Noah Thomas", "Digital Marketing", "enrolled"},
                {"Ava Hernandez", "Web Development", "watching"},
                {"William Moore", "Cyber Security", "enrolled"},
                {"Charlotte Jackson", "Cloud Computing", "watching"},
                {"Benjamin Martin", "Business Analytics", "enrolled"},
                {"Amelia Lee", "Introduction to Python", "watching"},
                {"Oliver Perez", "Data Science 101", "enrolled"},
                {"Harper Thompson", "UI/UX Design", "watching"},
                {"Elijah White", "Machine Learning", "enrolled"},
                {"Evelyn Harris", "Digital Marketing", "watching"},
                {"Daniel Clark", "Web Development", "enrolled"},
                {"Emily Lewis", "Cyber Security", "watching"},
                {"Jacob Robinson", "Cloud Computing", "enrolled"},
                {"Elizabeth Walker", "Business Analytics", "watching"},
                {"Michael Young", "Introduction to Python", "enrolled"},
                {"Sofia Hall", "Data Science 101", "watching"},
                {"Alexander Allen", "UI/UX Design", "enrolled"},
                {"Avery Wright", "Machine Learning", "watching"},
                {"Sebastian King", "Digital Marketing", "enrolled"},
                {"Scarlett Scott", "Web Development", "watching"},
                {"Jack Green", "Cyber Security", "enrolled"},
                {"Victoria Baker", "Cloud Computing", "watching"},
                {"Owen Adams", "Business Analytics", "enrolled"},
                {"Madison Nelson", "Introduction to Python", "watching"},
                {"Aiden Hill", "Data Science 101", "enrolled"},
                {"Luna Ramirez", "UI/UX Design", "watching"},
                {"Matthew Campbell", "Machine Learning", "enrolled"},
                {"Grace Mitchell", "Digital Marketing", "watching"},
                {"Samuel Roberts", "Web Development", "enrolled"},
                {"Chloe Carter", "Cyber Security", "watching"},
                {"David Phillips", "Cloud Computing", "enrolled"},
                {"Penelope Evans", "Business Analytics", "watching"},
                {"Joseph Turner", "Introduction to Python", "enrolled"},
                {"Layla Torres", "Data Science 101", "watching"},
                {"Carter Parker", "UI/UX Design", "enrolled"},
                {"Riley Collins", "Machine Learning", "watching"},
                {"Luke Edwards", "Digital Marketing", "enrolled"},
                {"Zoey Stewart", "Web Development", "watching"},
                {"Gabriel Flores", "Cyber Security", "enrolled"},
                {"Nora Morris", "Cloud Computing", "watching"},
                {"Isaac Nguyen", "Business Analytics", "enrolled"},
                {"Lily Murphy", "Introduction to Python", "watching"},
                {"Anthony Rivera", "Data Science 101", "enrolled"},
                {"Hannah Cook", "UI/UX Design", "watching"},
                {"Dylan Rogers", "Machine Learning", "enrolled"},
                {"Lillian Morgan", "Digital Marketing", "watching"},
                {"Leo Peterson", "Web Development", "enrolled"},
                {"Addison Cooper", "Cyber Security", "watching"},
                {"Julian Reed", "Cloud Computing", "enrolled"},
                {"Aubrey Bailey", "Business Analytics", "watching"},
                {"Christopher Bell", "Introduction to Python", "enrolled"},
                {"Ellie Gomez", "Data Science 101", "watching"},
                {"Joshua Kelly", "UI/UX Design", "enrolled"},
                {"Stella Howard", "Machine Learning", "watching"},
                {"Andrew Ward", "Digital Marketing", "enrolled"},
                {"Natalie Cox", "Web Development", "watching"},
                {"Lincoln Diaz", "Cyber Security", "enrolled"},
                {"Leah Richardson", "Cloud Computing", "watching"},
                {"Mateo Wood", "Business Analytics", "enrolled"},
                {"Hazel Watson", "Introduction to Python", "watching"},
                {"Ryan Brooks", "Data Science 101", "enrolled"},
                {"Violet Bennett", "UI/UX Design", "watching"},
                {"Nathan Gray", "Machine Learning", "enrolled"},
                {"Aurora James", "Digital Marketing", "watching"},
                {"Aaron Reyes", "Web Development", "enrolled"},
                {"Savannah Cruz", "Cyber Security", "watching"},
                {"Charles Hughes", "Cloud Computing", "enrolled"},
                {"Audrey Price", "Business Analytics", "watching"},
                {"Thomas Myers", "Introduction to Python", "enrolled"},
                {"Brooklyn Long", "Data Science 101", "watching"},
                {"Caleb Foster", "UI/UX Design", "enrolled"},
                {"Bella Sanders", "Machine Learning", "watching"},
                {"Josiah Ross", "Digital Marketing", "enrolled"},
                {"Claire Morales", "Web Development", "watching"},
                {"Christian Powell", "Cyber Security", "enrolled"},
                {"Skylar Sullivan", "Cloud Computing", "watching"},
                {"Hunter Russell", "Business Analytics", "enrolled"},
                {"Lucy Ortiz", "Introduction to Python", "watching"},
                {"Eli Jenkins", "Data Science 101", "enrolled"},
                {"Paisley Perry", "UI/UX Design", "watching"},
                {"Jonathan Butler", "Machine Learning", "enrolled"},
                {"Everly Barnes", "Digital Marketing", "watching"},
                {"Landon Fisher", "Web Development", "enrolled"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Anna Henderson", "Cyber Security", "watching"},
                {"Adrian Coleman", "Cloud Computing", "enrolled"},
                {"Caroline Simmons", "Business Analytics", "watching"},
                {"Caroline Simmons", "Business Analytics", "enrolled"},
                {"Caroline Simmons", "Business Analytics", "watching"},
                {"Caroline Simmons", "Business Analytics", "watching"},
                {"Caroline Simmons", "Business Analytics", "watching"},
                {"Caroline Simmons", "Business Analytics", "watching"},
                {"Caroline Simmons", "Business Analytics", "watching"},
                {"Nolan Patterson", "Introduction to Python", "enrolled"}
        };

        Map<Integer,UserData> MainLog = new HashMap<>();
        int count=1;
        for(int i=0;i<dummylogs.length;i++){
            UserData userobject = new UserData(dummylogs[i][0],dummylogs[i][1],dummylogs[i][2]);
            MainLog.put(count,userobject);
            count++;
        }

        Map<String, Integer> CourseEnrollment = new HashMap<>();
        for(UserData users: MainLog.values()){
            if(users.activity.equals("enrolled")){
                CourseEnrollment.put(users.course,CourseEnrollment.getOrDefault(users.course,0)+1);
            }
        }

        System.out.println("Courses enrolled by users");
        for(Map.Entry<String,Integer> data : CourseEnrollment.entrySet()){
            System.out.println(data.getKey()+" - "+data.getValue());
        }

        Map<String,Integer> Activity = new HashMap<>();
        for(UserData user:MainLog.values()){
            String name = user.name;
            if(!user.activity.equals("enrolled")) {
                Activity.put(name, Activity.getOrDefault(name, 0) + 1);
            }
        }

        String MostActiveUser1="";
        int max=0;
        for(Map.Entry<String,Integer> entry: Activity.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                MostActiveUser1 = entry.getKey();
            }
        }
        System.out.println(MostActiveUser1 +"-- Activities: "+ max);
    }
}
