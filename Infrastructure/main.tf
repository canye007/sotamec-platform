module "vpc" {
  source = "./modules/vpc"

  name_prefix = local.name_prefix
}

module "ecr" {
  source = "./modules/ecr"
  name_prefix = local.name_prefix
}

module "eks" {
  source = "./modules/eks"

  vpc_id     = module.vpc.vpc_id
  subnet_ids = module.vpc.private_subnets
  name       = local.name_prefix
}

module "rds" {
  source = "./modules/rds"

  vpc_id     = module.vpc.vpc_id
  subnet_ids = module.vpc.private_subnets
}