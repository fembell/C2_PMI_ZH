public class PositionChanges extends Team{
    public void promote(String name,String position){
        for(int i = 0; i< team.size();i++){
            if(team.get(i)[0]==name)
                team.set(i, new String[]{name, position});
        }
    }
}
