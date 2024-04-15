package com.example.apirest;

public class Vendre {
    public class VotreActivite extends AppCompatActivity {

        // Déclarer le bouton
        private Button btnAjouterPhoto;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_vendre);

            // Initialiser le bouton
            btnAjouterPhoto = findViewById(R.id.btnAjouterPhoto);

            // Définir le clic du bouton
            btnAjouterPhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Ajoutez le code pour ouvrir la galerie ou l'appareil photo ici
                    private static final int REQUEST_IMAGE_PICK = 1;

                    private void ouvrirGalerie() {
                        Intent galerieIntent = new Intent(Intent.ACTION_PICK);
                        galerieIntent.setType("image/*");
                        startActivityForResult(galerieIntent, REQUEST_IMAGE_PICK);
                    }

                    ouvrirGalerie();
                }
            });
        }

        // Méthode pour ouvrir la galerie ou l'appareil photo
        private void ouvrirGalerie() {
            // Ajoutez le code pour ouvrir la galerie ou l'appareil photo ici
            // Utilisez Intent pour ouvrir la galerie ou l'appareil photo
        }
    }

}
