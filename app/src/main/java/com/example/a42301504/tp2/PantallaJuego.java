package com.example.a42301504.tp2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOverlay;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class PantallaJuego extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_juego);
        AsignarImagenesAlAzar();


    }
int gano;

    void AsignarImagenesAlAzar() {
        boolean VolverAGenerar;
        VolverAGenerar = true;

        while (VolverAGenerar == true) {
            int SumaTotalBotones = 0;

            for (int punteroboton = 0; punteroboton <= 8; punteroboton++) {
                switch (punteroboton) {
                    case 0:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton1);
                    case 1:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton2);
                    case 2:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton3);
                    case 3:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton4);
                    case 4:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton5);
                    case 5:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton6);
                    case 6:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton7);
                    case 7:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton8);
                    case 8:
                        SumaTotalBotones += AsignarImagenABoton(R.id.boton9);
                }

                if (SumaTotalBotones != 0 && SumaTotalBotones != 9) {
                    VolverAGenerar = false;
                }

            }
        }
    }

    int AsignarImagenABoton(int IdDelBotonAAsignar) {

        Random GeneradorDeAzar;
        GeneradorDeAzar = new Random();

        int NumeroImagen;
        NumeroImagen = GeneradorDeAzar.nextInt(2);

        ImageButton BotonACambiar;
        BotonACambiar = (ImageButton) findViewById(IdDelBotonAAsignar);

        if (NumeroImagen == 0) {
            BotonACambiar.setImageResource(R.drawable.ct);
        } else {
            BotonACambiar.setImageResource(R.drawable.tt);
        }
        return NumeroImagen;
    }


    public void accionboton(View vista) {
        ImageButton boton1 = (ImageButton) findViewById(R.id.boton1);
        ImageButton boton2 = (ImageButton) findViewById(R.id.boton2);
        ImageButton boton3 = (ImageButton) findViewById(R.id.boton3);
        ImageButton boton4 = (ImageButton) findViewById(R.id.boton4);
        ImageButton boton5 = (ImageButton) findViewById(R.id.boton5);
        ImageButton boton6 = (ImageButton) findViewById(R.id.boton6);
        ImageButton boton7 = (ImageButton) findViewById(R.id.boton7);
        ImageButton boton8 = (ImageButton) findViewById(R.id.boton8);
        ImageButton boton9 = (ImageButton) findViewById(R.id.boton9);

        ImageButton BotonPresionado;
        BotonPresionado = (ImageButton) vista;

        Drawable.ConstantState tt;
        tt = getResources().getDrawable(R.drawable.tt).getConstantState();

        Drawable.ConstantState ct;
        ct = getResources().getDrawable(R.drawable.ct).getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView;
        CodigodelaimagenDeLaImageView = BotonPresionado.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView1;
        CodigodelaimagenDeLaImageView1 = boton1.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView2;
        CodigodelaimagenDeLaImageView2 = boton2.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView3;
        CodigodelaimagenDeLaImageView3 = boton3.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView4;
        CodigodelaimagenDeLaImageView4 = boton4.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView5;
        CodigodelaimagenDeLaImageView5 = boton5.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView6;
        CodigodelaimagenDeLaImageView6 = boton6.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView7;
        CodigodelaimagenDeLaImageView7 = boton7.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView8;
        CodigodelaimagenDeLaImageView8 = boton8.getDrawable().getConstantState();

        Drawable.ConstantState CodigodelaimagenDeLaImageView9;
        CodigodelaimagenDeLaImageView9 = boton9.getDrawable().getConstantState();


        if (BotonPresionado.getId() == R.id.boton1) {
            if (tt == CodigodelaimagenDeLaImageView1) {
                boton1.setImageResource(R.drawable.ct);
                CodigodelaimagenDeLaImageView1 = ct;
            } else {
                boton1.setImageResource(R.drawable.tt);
                CodigodelaimagenDeLaImageView1 = tt;
            }
            if (tt == CodigodelaimagenDeLaImageView2) {
                boton2.setImageResource(R.drawable.ct);
                CodigodelaimagenDeLaImageView2 = ct;
            } else {
                boton2.setImageResource(R.drawable.tt);
                CodigodelaimagenDeLaImageView2 = tt;
            }
            if (tt == CodigodelaimagenDeLaImageView5) {
                boton5.setImageResource(R.drawable.ct);
                CodigodelaimagenDeLaImageView5 = ct;
            } else {
                boton5.setImageResource(R.drawable.tt);
                CodigodelaimagenDeLaImageView5 = tt;
            }
            if (tt == CodigodelaimagenDeLaImageView4) {
                boton4.setImageResource(R.drawable.ct);
                CodigodelaimagenDeLaImageView4 = ct;
            } else {
                boton4.setImageResource(R.drawable.tt);
                CodigodelaimagenDeLaImageView4 = tt;
            }
        } else {
            if (BotonPresionado.getId() == R.id.boton2) {
                if (tt == CodigodelaimagenDeLaImageView2) {
                    boton2.setImageResource(R.drawable.ct);
                    CodigodelaimagenDeLaImageView2 = ct;
                } else {
                    boton2.setImageResource(R.drawable.tt);
                    CodigodelaimagenDeLaImageView2 = tt;
                }
                if (tt == CodigodelaimagenDeLaImageView1) {
                    boton1.setImageResource(R.drawable.ct);
                    CodigodelaimagenDeLaImageView1 = ct;
                } else {
                    boton1.setImageResource(R.drawable.tt);
                    CodigodelaimagenDeLaImageView1 = tt;
                }
                if (tt == CodigodelaimagenDeLaImageView3) {
                    boton3.setImageResource(R.drawable.ct);
                    CodigodelaimagenDeLaImageView3 = ct;
                } else {
                    boton3.setImageResource(R.drawable.tt);
                    CodigodelaimagenDeLaImageView3 = tt;
                }
                if (tt == CodigodelaimagenDeLaImageView5) {
                    boton5.setImageResource(R.drawable.ct);
                    CodigodelaimagenDeLaImageView5 = ct;
                } else {
                    boton5.setImageResource(R.drawable.tt);
                    CodigodelaimagenDeLaImageView5 = tt;
                }
            } else {
                if (BotonPresionado.getId() == R.id.boton3) {
                    if (tt == CodigodelaimagenDeLaImageView2) {
                        boton2.setImageResource(R.drawable.ct);
                        CodigodelaimagenDeLaImageView2 = ct;
                    } else {
                        boton2.setImageResource(R.drawable.tt);
                        CodigodelaimagenDeLaImageView2 = tt;
                    }
                    if (tt == CodigodelaimagenDeLaImageView3) {
                        boton3.setImageResource(R.drawable.ct);
                        CodigodelaimagenDeLaImageView3 = ct;
                    } else {
                        boton3.setImageResource(R.drawable.tt);
                        CodigodelaimagenDeLaImageView3 = tt;
                    }
                    if (tt == CodigodelaimagenDeLaImageView5) {
                        boton5.setImageResource(R.drawable.ct);
                        CodigodelaimagenDeLaImageView5 = ct;
                    } else {
                        boton5.setImageResource(R.drawable.tt);
                        CodigodelaimagenDeLaImageView5 = tt;
                    }
                    if (tt == CodigodelaimagenDeLaImageView6) {
                        boton6.setImageResource(R.drawable.ct);
                        CodigodelaimagenDeLaImageView6 = ct;
                    } else {
                        boton6.setImageResource(R.drawable.tt);
                        CodigodelaimagenDeLaImageView6 = tt;
                    }
                }else {
                    if (BotonPresionado.getId() == R.id.boton4) {
                        if (tt == CodigodelaimagenDeLaImageView4) {
                            boton4.setImageResource(R.drawable.ct);
                            CodigodelaimagenDeLaImageView4 = ct;
                        } else {
                            boton4.setImageResource(R.drawable.tt);
                            CodigodelaimagenDeLaImageView4 = tt;
                        }
                    if (tt == CodigodelaimagenDeLaImageView1) {
                        boton1.setImageResource(R.drawable.ct);
                        CodigodelaimagenDeLaImageView1 = ct;
                    } else {
                        boton1.setImageResource(R.drawable.tt);
                        CodigodelaimagenDeLaImageView1 = tt;
                    }
                    if (tt == CodigodelaimagenDeLaImageView5) {
                        boton5.setImageResource(R.drawable.ct);
                        CodigodelaimagenDeLaImageView5 = ct;
                    } else {
                        boton5.setImageResource(R.drawable.tt);
                        CodigodelaimagenDeLaImageView5 = tt;
                    }
                    if (tt == CodigodelaimagenDeLaImageView7) {
                        boton7.setImageResource(R.drawable.ct);
                        CodigodelaimagenDeLaImageView7 = ct;
                    } else {
                        boton7.setImageResource(R.drawable.tt);
                        CodigodelaimagenDeLaImageView7 = tt;
                    }
                } else {
                    if (BotonPresionado.getId() == R.id.boton5) {
                        if (tt == CodigodelaimagenDeLaImageView5) {
                            boton5.setImageResource(R.drawable.ct);
                            CodigodelaimagenDeLaImageView5 = ct;
                        } else {
                            boton5.setImageResource(R.drawable.tt);
                            CodigodelaimagenDeLaImageView5 = tt;
                        }
                        if (tt == CodigodelaimagenDeLaImageView2) {
                            boton2.setImageResource(R.drawable.ct);
                            CodigodelaimagenDeLaImageView2 = ct;
                        } else {
                            boton2.setImageResource(R.drawable.tt);
                            CodigodelaimagenDeLaImageView2 = tt;
                        }
                        if (tt == CodigodelaimagenDeLaImageView6) {
                            boton6.setImageResource(R.drawable.ct);
                            CodigodelaimagenDeLaImageView6 = ct;
                        } else {
                            boton6.setImageResource(R.drawable.tt);
                            CodigodelaimagenDeLaImageView6 = tt;
                        }
                        if (tt == CodigodelaimagenDeLaImageView4) {
                            boton4.setImageResource(R.drawable.ct);
                            CodigodelaimagenDeLaImageView4 = ct;
                        } else {
                            boton4.setImageResource(R.drawable.tt);
                            CodigodelaimagenDeLaImageView4 = tt;
                        }
                        if (tt == CodigodelaimagenDeLaImageView8) {
                            boton8.setImageResource(R.drawable.ct);
                            CodigodelaimagenDeLaImageView8 = ct;
                        } else {
                            boton8.setImageResource(R.drawable.tt);
                            CodigodelaimagenDeLaImageView8 = tt;
                        }

                    } else {
                        if (BotonPresionado.getId() == R.id.boton6) {
                            if (tt == CodigodelaimagenDeLaImageView6) {
                                boton6.setImageResource(R.drawable.ct);
                                CodigodelaimagenDeLaImageView6 = ct;
                            } else {
                                boton6.setImageResource(R.drawable.tt);
                                CodigodelaimagenDeLaImageView6 = tt;
                            }
                            if (tt == CodigodelaimagenDeLaImageView5) {
                                boton5.setImageResource(R.drawable.ct);
                                CodigodelaimagenDeLaImageView5 = ct;
                            } else {
                                boton5.setImageResource(R.drawable.tt);
                                CodigodelaimagenDeLaImageView5 = tt;
                            }
                            if (tt == CodigodelaimagenDeLaImageView3) {
                                boton3.setImageResource(R.drawable.ct);
                                CodigodelaimagenDeLaImageView3 = ct;
                            } else {
                                boton3.setImageResource(R.drawable.tt);
                                CodigodelaimagenDeLaImageView3 = tt;
                            }
                            if (tt == CodigodelaimagenDeLaImageView9) {
                                boton9.setImageResource(R.drawable.ct);
                                CodigodelaimagenDeLaImageView9 = ct;
                            } else {
                                boton9.setImageResource(R.drawable.tt);
                                CodigodelaimagenDeLaImageView9 = tt;
                            }
                        } else {
                            if (BotonPresionado.getId() == R.id.boton7) {
                                if (tt == CodigodelaimagenDeLaImageView7) {
                                    boton7.setImageResource(R.drawable.ct);
                                    CodigodelaimagenDeLaImageView7 = ct;
                                } else {
                                    boton7.setImageResource(R.drawable.tt);
                                    CodigodelaimagenDeLaImageView7 = tt;
                                }
                                if (tt == CodigodelaimagenDeLaImageView4) {
                                    boton4.setImageResource(R.drawable.ct);
                                    CodigodelaimagenDeLaImageView4 = ct;
                                } else {
                                    boton4.setImageResource(R.drawable.tt);
                                    CodigodelaimagenDeLaImageView4 = tt;
                                }
                                if (tt == CodigodelaimagenDeLaImageView5) {
                                    boton5.setImageResource(R.drawable.ct);
                                    CodigodelaimagenDeLaImageView5 = ct;
                                } else {
                                    boton5.setImageResource(R.drawable.tt);
                                    CodigodelaimagenDeLaImageView5 = tt;
                                }
                                if (tt == CodigodelaimagenDeLaImageView8) {
                                    boton8.setImageResource(R.drawable.ct);
                                    CodigodelaimagenDeLaImageView8 = ct;
                                } else {
                                    boton8.setImageResource(R.drawable.tt);
                                    CodigodelaimagenDeLaImageView8 = tt;
                                }
                            } else {
                                if (BotonPresionado.getId() == R.id.boton8) {
                                    if (tt == CodigodelaimagenDeLaImageView8) {
                                        boton8.setImageResource(R.drawable.ct);
                                        CodigodelaimagenDeLaImageView8 = ct;
                                    } else {
                                        boton8.setImageResource(R.drawable.tt);
                                        CodigodelaimagenDeLaImageView8 = tt;
                                    }
                                    if (tt == CodigodelaimagenDeLaImageView7) {
                                        boton7.setImageResource(R.drawable.ct);
                                        CodigodelaimagenDeLaImageView7 = ct;
                                    } else {
                                        boton7.setImageResource(R.drawable.tt);
                                        CodigodelaimagenDeLaImageView7 = tt;
                                    }
                                    if (tt == CodigodelaimagenDeLaImageView5) {
                                        boton5.setImageResource(R.drawable.ct);
                                        CodigodelaimagenDeLaImageView5 = ct;
                                    } else {
                                        boton5.setImageResource(R.drawable.tt);
                                        CodigodelaimagenDeLaImageView5 = tt;
                                    }
                                    if (tt == CodigodelaimagenDeLaImageView9) {
                                        boton9.setImageResource(R.drawable.ct);
                                        CodigodelaimagenDeLaImageView9 = ct;
                                    } else {
                                        boton9.setImageResource(R.drawable.tt);
                                        CodigodelaimagenDeLaImageView9 = tt;
                                    }
                                } else {
                                    if (BotonPresionado.getId() == R.id.boton9) {
                                        if (tt == CodigodelaimagenDeLaImageView9) {
                                            boton9.setImageResource(R.drawable.ct);
                                            CodigodelaimagenDeLaImageView9 = ct;
                                        } else {
                                            boton9.setImageResource(R.drawable.tt);
                                            CodigodelaimagenDeLaImageView9 = tt;
                                        }
                                        if (tt == CodigodelaimagenDeLaImageView8) {
                                            boton8.setImageResource(R.drawable.ct);
                                            CodigodelaimagenDeLaImageView8 = ct;
                                        } else {
                                            boton8.setImageResource(R.drawable.tt);
                                            CodigodelaimagenDeLaImageView8 = tt;
                                        }
                                        if (tt == CodigodelaimagenDeLaImageView5) {
                                            boton5.setImageResource(R.drawable.ct);
                                            CodigodelaimagenDeLaImageView5 = ct;
                                        } else {
                                            boton5.setImageResource(R.drawable.tt);
                                            CodigodelaimagenDeLaImageView5 = tt;
                                        }
                                        if (tt == CodigodelaimagenDeLaImageView6) {
                                            boton6.setImageResource(R.drawable.ct);
                                            CodigodelaimagenDeLaImageView6 = ct;
                                        } else {
                                            boton6.setImageResource(R.drawable.tt);
                                            CodigodelaimagenDeLaImageView6 = tt;
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        if (tt == CodigodelaimagenDeLaImageView1 && tt == CodigodelaimagenDeLaImageView2 && tt == CodigodelaimagenDeLaImageView3 && tt == CodigodelaimagenDeLaImageView4 && tt == CodigodelaimagenDeLaImageView5 && tt == CodigodelaimagenDeLaImageView6 && tt == CodigodelaimagenDeLaImageView7 && tt == CodigodelaimagenDeLaImageView8 && tt == CodigodelaimagenDeLaImageView9){
            Intent ir4;
            ir4 = new Intent(PantallaJuego.this,Gano.class);
            startActivity(ir4);
        }
        else{
            if (ct == CodigodelaimagenDeLaImageView1 && ct == CodigodelaimagenDeLaImageView2 && ct == CodigodelaimagenDeLaImageView3 && ct == CodigodelaimagenDeLaImageView4 && ct == CodigodelaimagenDeLaImageView5 && ct == CodigodelaimagenDeLaImageView6 && ct == CodigodelaimagenDeLaImageView7 && ct == CodigodelaimagenDeLaImageView8 && ct == CodigodelaimagenDeLaImageView9){
                Intent ir4;
                ir4 = new Intent(PantallaJuego.this,Gano.class);
                startActivity(ir4);
            }
        }


        }
    }
}










