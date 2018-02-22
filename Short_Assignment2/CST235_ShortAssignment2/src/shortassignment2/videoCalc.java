package shortassignment2;

public class videoCalc implements java.io.Serializable {
    private int resolution = 0;
    private double video_length = 0;
    private double file_size = 0;
    
    public videoCalc(int resolution, double video_length ){
        setResolution(resolution);
        setVideo_length(video_length);
    }
    
    public void setResolution(int resolution){
        this.resolution = resolution;
    }
    
    public int getResolution(){
        return this.resolution;
    }
    
    public void setVideo_length(double video_length){
        this.video_length = video_length;
    }
    
    public double getVideo_length(){
        return this.video_length;
    }
    
    public String getFile_size(){
        if(getResolution() == 720){
            file_size = video_length * 5; // 5mbps is recommended biterate size per second for 720p video
        }else if(getResolution() == 1080){
            file_size = video_length * 8; // 8mbps is recommended biterate size per second for 720p video
        }
        
        if(file_size > 1000){
            String formattedString = String.format("%.02f", file_size/1000) + " GB of disk space.";
            return formattedString;
        }else{
            return Double.toString(file_size) + " MB of disk space.";
        }
        
        
    }
    
}