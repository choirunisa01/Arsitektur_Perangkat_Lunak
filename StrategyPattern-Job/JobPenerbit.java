public class JobPenerbit {
    private JobBehavior jobType; 

    public void cariJabatan() {
        this.jobType.job();
    }

    public void setJobType(JobBehavior jobType) {
        this.jobType = jobType;
    }
}