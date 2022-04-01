import java.util.ArrayList;
import java.util.Arrays;
public class Team {
    ArrayList<String[]> team = new ArrayList<>();
    public void newMember(String name,String position){
        String[] member = {name, position};
        team.add(member);
    }
    public void leaveTeam(String name){
        for(int i = 0;i<team.size();i++){
            if(team.get(i)[0]==name){
                team.remove(i);
            }
        }
    }
    public ArrayList<String[]> getMembers(){
        return team;
    }
}
