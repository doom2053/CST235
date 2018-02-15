
public class video {
	static double diskSpace1 = 0;
	static double diskSpace2 = 0;

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        
	        //passes values of the videoCalculator first being quality second being seconds.
	        videoCalculator sizeVideo1 = new videoCalculator(720, 180);
	        
	      //passes values of the videoCalculator first being quality second being seconds.
	        videoCalculator sizeVideo2 = new videoCalculator(1080, 190);
	        
	        // get file size from videoCalculator object
	        diskSpace1 = sizeVideo1.getFile_size();
	        
	        // get file size from videoCalculator object
	        diskSpace2 = sizeVideo2.getFile_size();
	        
	        // Print out results for 1st video
	        if(diskSpace1 > 1000){
	            System.out.println("A video with a resolution of " + sizeVideo1.getResolution() + "p\n"
	            +"with a length of " + sizeVideo1.getVideo_length() + " seconds,\n"
	            +"will require " + String.format( "%.2f", diskSpace1 / 1000 )+ " GB of disk space.");
	        }else{
	            System.out.println("A video with a resolution of " + sizeVideo1.getResolution() + "p\n"
	            +"with a length of " + sizeVideo1.getVideo_length() + " seconds,\n"
	            +"will require " + String.format( "%.2f", diskSpace1 )+ " MB of disk space.");
	        }
	        
	
	        System.out.println();
	        
	        // Print out results for 2st video
	        if(diskSpace2 > 1000){
	            System.out.println("A video with a resolution of " + sizeVideo2.getResolution() + "p\n"
	            +"with a length of " + sizeVideo2.getVideo_length() + " seconds,\n"
	            +"will require " + String.format( "%.2f", diskSpace2 / 1000 )+ " GB of disk space.");
	        }else{
	            System.out.println("A video with a resolution of " + sizeVideo2.getResolution() + "p\n"
	            +"with a length of " + sizeVideo2.getVideo_length() + " seconds,\n"
	            +"will require " + String.format( "%.2f", diskSpace2 )+ " MB of disk space.");
	        }
	    }
}
