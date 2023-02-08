public class BallPredictor {   // this class is responsible for predicting outcome of current ball.

    int prediction() {
        return ((int) (Math.random() * 10)) % 8;
    }
}
