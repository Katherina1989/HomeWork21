package HomeWork21;

public class Course {

        String result;
        private int swamp;
        private int river;
        private int mountain;

        public Course(int swamp, int river, int mountain) {
            this.swamp = swamp;
            this.river = river;
            this.mountain = mountain;
        }

        public void doIt(Team team){
            result = "Команда: "+ team.getName()+ " " + '\n';
            for(Sportsman sportsman: team.getSportsman()){
                result += "Участник: " + sportsman.getName()+ " " + '\n';
                int value = sportsman.getSpeed();
                testSwamp(value);
                testRiver(value);
                testMountain(value);

            }

            team.setResult(result);
        }

        private void testSwamp(int value){
            if(value<swamp) result += "Первое препятствие пройдено"+ '\n';

        }

        private void testRiver(int value){
            if(value<river - 50) result += "Второе препятствие пройдено"+ '\n';

        }

        private void testMountain(int value){
            if(value<mountain - 100) result += "Третье препятствие пройдено"+ '\n';

        }

    }
