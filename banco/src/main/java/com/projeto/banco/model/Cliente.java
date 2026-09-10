@Entity(name="tb_clientes")
@Getters
@NoArgsConstructor

class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable=false)
private String nome;

@Column(nullable=false, unique=true)
private String email;

@Column(nullable=false)
private String senha;

@Column(nullable=false, unique=true)
private String cpf;

@Column(nullable=false, unique=true)
private String telefone;


}