public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)||(extraBuckets<0)) {
            return -1;
        }

        double areaOfWall = Math.floor(width * height);
        int buckets = (int) ((areaOfWall / areaPerBucket) - extraBuckets);
        if (buckets < (areaOfWall / areaPerBucket)) {
            buckets++;
        }
        System.out.println("Bob can use " + buckets + " buckets");
        return (int) Math.ceil(buckets);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if ((width<0)||(height<0)||(areaPerBucket<0)){
            return -1;
        }
        int bucketsNeeded = getBucketCount(width,height,areaPerBucket,0);
        return bucketsNeeded;
    }

    public static int getBucketCount(double area,double areaPerBucket){
        if ((area <0)||(areaPerBucket<0)){
            return -1;
        }
        double sqRoot = Math.sqrt(area);
        return getBucketCount(sqRoot,sqRoot,areaPerBucket);
    }
}

// areaPerBucket 20
// extraBuckets 5