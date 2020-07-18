public static void main(String[] args) {
    final Runnable task = new Runnable() {
             
        @Override
        public void run() {
            //action            
        }
    };
         
    final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);
 
}
