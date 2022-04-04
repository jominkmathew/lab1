 public void onCli(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://tkmce.ac.in/"));
        startActivity(i);
    }