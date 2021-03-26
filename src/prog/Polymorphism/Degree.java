    package prog.Polymorphism;

    class Degree {
        public void getDegree(String stringDegree) {
            System.out.println("This method is to post that " + stringDegree);
        }
    }
    class UnderGraduate extends Degree {
        public void getDegree() {
            System.out.println("I am an Under Graduate");
        }
    }
    class PostGraduate extends Degree{
        public void getDegree() {
            System.out.println("I am a Post Graduate");
        }
    }
    class MainClass{
        public static void main(String[] args) {
            Degree degree = new Degree();
            degree.getDegree("I got a Degree");
            UnderGraduate underGraduate = new UnderGraduate();
            underGraduate.getDegree();
            PostGraduate postGraduate = new PostGraduate();
            postGraduate.getDegree();
        }
    }
