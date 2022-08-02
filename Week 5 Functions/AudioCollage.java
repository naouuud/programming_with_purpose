public class AudioCollage {
    public static double[] amplify(double[] a, double alpha) {
        double[] amplified = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            amplified[i] = a[i] * alpha;
        }
        return amplified;
    }
    public static double[] reverse(double[] a) {
        double[] reversed = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - 1 - i];
        }
        return reversed;
    }
    public static double[] merge(double[] a, double[] b) {
        double[] merged = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }
        return merged;
    }
    public static double[] mix(double[] a, double[] b) {
        if (a.length < b.length) {
            double[] paddedA = new double[b.length];
            for (int i = 0; i < a.length; i++) {
                paddedA[i] = a[i];
            }
            double[] mixed = new double[b.length];
            for (int i = 0; i < b.length; i++) {
                mixed[i] = paddedA[i] + b[i];
            }
            return mixed;
        } else if (a.length > b.length) {
            double[] paddedB = new double[a.length];
            for (int i = 0; i < b.length; i++) {
                paddedB[i] = b[i];
            }
            double[] mixed = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                mixed[i] = a[i] + paddedB[i];
            }
            return mixed;
        } else {
            double[] mixed = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                mixed[i] = a[i] + b[i];
            }
            return mixed;
        }
    }
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] resampled = new double[(int)(a.length / alpha)];
        for (int i = 0; i < resampled.length; i++) {
            resampled[i] = a[(int)(i * alpha)];
        }
        return resampled;
    }
    public static void main(String[] args) {
        double[] cow = StdAudio.read("cow.wav");
        double[] piano = StdAudio.read("piano.wav");
        double[] buzzer = StdAudio.read("buzzer.wav");
        double[] exposure = StdAudio.read("exposure.wav");
        double[] harp = StdAudio.read("harp.wav");
        StdAudio.play(mix(mix(changeSpeed(piano, 0.3), merge(reverse(amplify(exposure, 4)), amplify(merge(cow, buzzer), 0.2))), changeSpeed(harp, 0.1)));
    }
}
