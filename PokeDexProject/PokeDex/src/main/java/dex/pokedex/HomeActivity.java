package dex.pokedex;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends Activity {

    public void toPokemon(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toMoves(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toAbilities(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void toItems(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toBerries(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toCatchCalculator(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toTypeEffectiveness(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toNatureEffectiveness(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toPokeDex3D(View v){
        Toast toast = Toast.makeText(this,
                "Coming soon to an Android device near you!", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(getString(R.string.app_name));

        setContentView(R.layout.activity_home);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
}
