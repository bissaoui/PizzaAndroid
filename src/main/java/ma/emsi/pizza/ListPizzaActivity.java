package ma.emsi.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.baoyz.swipemenulistview.SwipeMenuView;

import java.io.Serializable;

import ma.emsi.pizza.adapter.MyAdapter;
import ma.emsi.pizza.classes.Produit;
import ma.emsi.pizza.service.ProduitService;

public class ListPizzaActivity extends AppCompatActivity {
    SwipeMenuListView lv ;
    private Object Tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);
        ProduitService ps = new ProduitService();
        lv = (SwipeMenuListView) findViewById(R.id.lv1);
              ps.create(new Produit("BRUSCHETTA PIZZA ", 5, R.mipmap.pizza2, "35 min", "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded  part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup  fresh basil leaves, thinly sliced\n- 1 tablespoon olive oil\n- 2 garlic  cloves, minced\n- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried  thyme\n- 1/2 teaspoon balsamic vinegar\n- 1/4 teaspoon salt\n- 1/8 teaspoon  pepper\n- Additional fresh basil leaves, optional","You might need a knife  and fork for this hearty pizza! Loaded with Italian flavor and plenty of  fresh tomatoes, it's bound to become a family favorite. It's even better  with a homemade, whole wheat crust! —Debra Kell, Owasso, Oklahoma","STEP  1:\n\n In a small skillet, cook sausage over medium heat until no longer pink; drain. Place crust on an ungreased baking sheet. Top with pepperoni, sausage and cheese. Bake at 450° for 10-12 minutes or until cheese is  melted.\n\nSTEP 2:\n\n In a small bowl, combine the tomatoes, sliced basil, oil, garlic, thyme, vinegar, salt and pepper. Spoon over pizza.Garnish with additional basil if desired. Yield: 8 slices."));
        ps.create(new Produit("SPINACH PIZZA", 2, R.mipmap.pizza3, "25 min", "- 1package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend","This tasty pizza is so easy to prepare. My family, including my young daughter, loves it. What an easy way to make a delicious, veggiefilled meal! —Dawn Bartholomew, Raleigh, North Carolina","STEP 1:\n\n Prepare pizza dough according to package directions. With floured hands, press dough onto a greased 12-in. pizza pan.\n\nSTEP 2:\n\n Spread Alfredo sauce over dough to within 1 in. of edges. Thinly slice or chop tomatoes; top pizza with spinach, tomatoes and cheese.\n\nSTEP 3:\n\n Bake at 450° for 10-15 minutes or until cheese is melted and crust is golden brown. Yield: 4-6 servings."));
        ps.create(new Produit("DEEP-DISH SAUSAGE PIZZA ", 8, R.mipmap.pizza4, "45 min", "- 1 package (1/4 ounce) active dry yeast\n- 2/3 cup warm water (110° to 115°)\n- 1-3/4 to 2 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon each dried oregano, basil and marjoram\n- 1/2 teaspoon garlic salt\n- 1/2 teaspoon onion salt\n","My Grandma made the tastiest snacks for us when we stayed the night at her farm. Her wonderful pizza, hot from the oven, was covered with cheese and had fragrant herbs in the crust. Now this pizza is frequently a meal for my husband and me and our two young daughters. —Michele Madden, Washington Court House, Ohio","STEP 1:\n\n In a mixing bowl, dissolve yeast in water. Add 1 cup flour, oil and seasonings; beat until smooth. Add enough remaining flour to form a soft dough. turn onto a floured surface; knead until smooth and elastic, 6-8 minutes. Place in a greased bowl; turn once to greased top. Cover and let rise in a warm place until doubled, about 1 hour. Punch dough down; roll out into a 15-in. circle. Transfer to a well-greased 12-in. heavy ovenproof skillet, letting dough drape over edges. Sprinkle with 1 cup mozzarella.\n\nSTEP 2:\n\n In another skillet, saute onion, green peppers and seasonings in oil until tender; drain. Layer half of the mixture over crust. Layer with half of the Parmesan, sausage and tomatoes. Sprinkle with 2 cups mozzarella. Repeat layers. Fold crust over to form an edge. Bake for 400° for 20 minutes. Sprinkle with pepperoni and remaining mozzarella. Bake 10-15 minutes longer or until crust is browned. Let stand 10 minutes before slicing. Yield: 8 slices."));
        ps.create(new Produit("HOMEMADE PIZZA", 4, R.mipmap.pizza5, "50 min", "- 1package (1/4 ounce) active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water (110° to 115°)\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 can (15 ounces) tomato sauce\n- 1 can (15 ounces) tomato sauce\n- 1 teaspoon dried basil\n- 1 medium green pepper, diced\n- 2 cups shredded part-skim mozzarella cheese","This recipe is a hearty, zesty main dish with a crisp, golden crust. Feel free to use whatever toppings your family enjoys on these homemade pizzas. —Marianne Edwards, Lake Stevens, Washington\n","STEP 1:\n\n In large bowl, dissolve yeast and sugar in water; let stand for 5 minutes. Add oil and salt. Stir in flour, a cup at a time, until a soft dough forms.\n\nSTEP 2:\n\n Turn onto floured surface; knead until smooth and elastic, about 2-3 minutes. Place in a greased bowl, turning once to grease the top. Cover and let rise in a warm place until doubled, about 45 minutes. Meanwhile, cook beef and onion over medium heat until no longer pink; drain.\n\nSTEP 3:\n\n Punch down dough; divide in half. Press each into a greased 12-in. pizza pan. Combine the tomato sauce, oregano and basil; spread over each crust. Top with beef mixture, green pepper and cheese.\n\nSTEP 4:\n\n Bake at 400° for 25-30 minutes or until crust is lightly browned. Yield: 2 pizzas (3 servings each)."));
        ps.create(new Produit("PESTO CHICKEN PIZZA",3,R.mipmap.pizza6,"50 min","- 2 teaspoons active dry yeast\n- 1 cup warm water (110° to 115°)\n- 2-3/4 cups bread flour\n- 1 tablespoon plus 2 teaspoons olive oil, divided\n- 1 tablespoon sugar\n- 1-1/2 teaspoons salt, divided\n- 1/2 pound boneless skinless chicken breasts, cut into 1/2-inch pieces\n- 1 small onion, halved and thinly sliced\n- 1/2 each small green, sweet red and yellow peppers, julienned\n- 1/2 cup sliced fresh mushrooms\n- 3 tablespoons prepared pesto\n- 1-1/2 cups (6 ounces) shredded part-skim mozzarella cheese\n- 1/4 teaspoon pepper","This is the only pizza I make now. We love it! Keeping  the spices simple helps the flavors of the chicken and vegetables come  through. The pizza tastes incredible and is good for you, too. —Heather  Thompson, Woodland Hills, California","STEP 1:\n\n In a large bowl,  dissolve yeast in warm water. Beat in 1 cup flour, 1 tablespoon oil, sugar  and 1 teaspoon salt. Add the remaining flour; beat until combined.\n\nSTEP  2:\n\n Turn onto a lightly floured surface; knead until smooth and  elastic, about 6-8 minutes. Place in a bowl coated with cooking spray,  turning once to coat top. Cover and let rise in a warm place until doubled,  about 1 hour.\n\nSTEP 3:\n\n In a large nonstick skillet over medium heat,  cook the chicken, onion, peppers and mushrooms in remaining oil until  chicken is no longer pink and vegetables are tender. Remove from the heat;  set aside.\n\nSTEP 4:\n\n Punch dough down; roll into a 15-in. circle.  Transfer to a 14-in. pizza pan. Build up edges slightly. Spread with pesto.  Top with chicken mixture and cheese. Sprinkle with pepper and remaining  salt.\n\nSTEP 5:\n\n Bake at 400° for 18-20 minutes or until crust and  cheese are lightly browned. \n\nSTEP 6:\n\n Freeze option: Bake pizza  crust as directed; cool. Top with all the ingredients as directed and  securely wrap and freeze unbaked pizza. To use, unwrap pizza; bake as  directed, increasing time as necessary. Yield: 8 slices."));
        ps.create(new Produit("LOADED MEXICAN PIZZA",3,R.mipmap.pizza7,"30 min","- 1 can (15 ounces) black beans, rinsed and drained\n- 1 medium red onion, chopped\n- 1 small sweet yellow pepper, chopped\n- 3 teaspoons chili powder\n- 3/4 teaspoon ground cumin\n- 3 medium tomatoes, chopped\n- 1 jalapeno pepper, seeded and finely chopped\n- 1 garlic clove, minced\n- 1 prebaked 12-inch thin pizza crust\n- 2 cups chopped fresh spinach\n- 2 tablespoons minced fresh cilantro\n- Hot pepper sauce to taste\n- 1/2 cup shredded reduced-fat cheddar cheese\n- 1/2 cup shredded pepper jack cheese","My husband is a picky eater, but this healthy pizza has lots of flavor, and he actually looks forward to it. Leftovers are no problem, because this meal tastes better the next day. —Mary Barker, Knoxville, Tennessee","STEP 1:\n\n In a small bowl, mash black beans. Stir in the onion, yellow pepper, chili powder and cumin. In another bowl, combine the tomatoes, jalapeno and garlic.\n\nSTEP 2:\n\n Place crust on an ungreased 12-in. pizza pan; spread with bean mixture. Top with tomato mixture and spinach. Sprinkle with cilantro, pepper sauce and cheeses.\n\nSTEP 3:\n\n Bake at 400° for 12-15 minutes or until cheese is melted. Yield: 6 slices."));
        ps.create(new Produit("BACON CHEESEBURGER PIZZA",2,R.mipmap.pizza8,"20 min","- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 prebaked Italian bread shell crust ( 1pound)\n- 1 can (8 ounces) pizza sauce\n- 6 bacon strips, cooked and crumbled\n- 20 dill pickle coin slices\n- 2 cups (8 ounces) shredded mozzarella cheese\n- 2 cups (8 ounces) shredded cheddar cheese\n- 1 teaspoon pizza or Italian seasoning","Kids of all ages love pizza and cheeseburgers, and this recipe combines them both. My grandchildren usually request pizza for supper when they visit me. They like to help me assemble this version, and they especially enjoy eating it! —Cherie Ackerman, Lakeland, Minnesota","STEP 1:\n\n In a skillet, cook beef and onion over medium heat until meat is no longer pink; drain and set aside.\n\nSTEP 2:\n\n Place crust on an ungreased 12-in. pizza pan. Spread with pizza sauce. Top with beef mixture, bacon, pickles and cheeses. Sprinkle with pizza seasoning. Bake at 450° for 8-10 minutes or until cheese is melted. Yield: 8 slices."));
        ps.create(new Produit("PIZZA MARGHERITA",1,R.mipmap.pizza9,"30 min","- 3 teaspoons active dry yeast\n- 1 cup warm water (110° to 115°)\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups bread flour","A classic Pizza Margherita, named for Queen Margherita of Italy, shows off the colors of the Italian flag with red tomatoes, white mozzarella and fresh green basil. It's so scrumptious that you'll be glad the recipe makes not one but two 13-inch pizzas! —Loretta Lawrence, Myrtle Beach, South Carolina","STEP 1:\n\n In a large mixing bowl, dissolve yeast in warm water. Add the oil, sugar, salt and 1 cup flour. Beat until smooth. Stir in enough remaining flour to form a soft dough.\n\nSTEP 2:\n\n Turn onto a floured surface; knead until smooth and elastic, about 6-8 minutes. Place in a bowl coated with cooking spray, turning once to coat the top. Cover and let rise in a warm place until doubled, about 1 hour.\n\nSTEP 3:\n\n Punch dough down; divide in half. Roll each portion into a 13-in. circle. Transfer to two 14-in. pizza pans coated with cooking spray; build up edges slightly. Cover and let rest for 10 minutes.\n\nSTEP 4:\n\n Spoon tomatoes over crusts. Top with basil, cheese, oregano, pepper flakes, salt and pepper. Drizzle with oil. Bake at 450° for 15-20 minutes or until crustand cheese are golden brown. Yield: 2 pizzas (8 slices each)."));
        ps.create(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA",5,R.mipmap.pizza10,"45 min","- 1 package (1/4 ounce) active dry yeast\n- 1-1/4 cups warm water (110° to 115°)\n- 2 tablespoons olive oil\n1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 to 4 cups all-purpose flour","For 30 years, friends have been telling me to open a pizzeria using this recipe. It even freezes well. —Elizabeth Wolff, Carmel, Indiana","STEP 1:\n\n In a small bowl, dissolve yeast in warm water. In a large bowl, combine oil, salt, sugar, yeast mixture and 1 cup flour; beat on medium speed until smooth. Stir in enough remaining flour to form a stiff dough.\n\nSTEP 2:\n\n Turn dough onto a floured surface; knead until smooth and elastic, about 6-8 minutes. Place in a greased bowl, turning once to grease the top. Cover with plastic wrap and let rise in a warm place until doubled, about 1 hour.\n\nSTEP 3:\n\n Preheat oven to 425°. Grease a 13x9-in. baking pan. Punch down dough; divide into three portions. On a lightly floured surface, combine two portions of dough and roll into a 15x11-in. rectangle. Transfer to prepared pan, pressing onto bottom and up sides of pan. Top with 2 cups mozzarella cheese and 2 cups cheddar cheese. Sprinkle with flour, seasonings, cooked sausage, mushrooms and pepperoni.\n\nSTEP 4:\n\n Roll out remaining dough into a 13x9-in. rectangle. Place dough over filling, crimping edges to seal; prick top with a fork. Sprinkle with remaining cheeses. Bake on a lower oven rack 10 minutes.\n\nSTEP 3:\n\n Reduce oven setting to 375°. Spread pizza sauce over cheese. Bake 30-35 minutes longer or until edges are lightly browned. Let stand 10 minutes before cutting. If desired, sprinkle with Parmesan cheese. Yield: 12 servings."));

        MyAdapter dap = new MyAdapter(this, 0,ps.findAll());
        lv.setAdapter(dap);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tt;
                tt =view.findViewById(R.id.id);
            }
        });
        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override
            public void create(SwipeMenu menu) {
                // create "open" item
                SwipeMenuItem openItem = new SwipeMenuItem(
                        getApplicationContext());
                // set item background
                openItem.setBackground(new ColorDrawable(Color.rgb(0xC9, 0xC9,
                        0xCE)));
                // set item width
                openItem.setWidth((200));
                // set item title
                openItem.setTitle("Open");
                // set item title fontsize
                openItem.setTitleSize(18);
                // set item title font color
                openItem.setTitleColor(Color.WHITE);
                // add to menu
                menu.addMenuItem(openItem);

                // create "delete" item
                SwipeMenuItem deleteItem = new SwipeMenuItem(
                        getApplicationContext());
                // set item background
                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
                        0x3F, 0x25)));
                // set item width
                deleteItem.setWidth((200));

                // set a icon
               deleteItem.setIcon(R.drawable.ic_delete);
                // add to menu
                menu.addMenuItem(deleteItem);
            }
        };

        // set creator
        lv.setMenuCreator(creator);

        lv.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
                int id = dap.getItem(position).getId();
                switch (index) {
                    case 0:


                        Intent intent =  new Intent(ListPizzaActivity.this,MainActivity.class);
                        intent.putExtra("Produit", (Serializable) ps.findById(id));
                        startActivity(intent);

                        break;
                    case 1:
                        ps.delete(ps.findById(id));
                        lv.setAdapter(dap);
                        break;
                }
                return false;
            }});

    }
}